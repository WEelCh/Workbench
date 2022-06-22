// PINOUT { 4,5,16,17,18,19 }

//blinky LEDs
const int rLED = 19;
const int gLED = 18;
const int yLED =  5;
int LED_time   = 0;

//lSENS complex
const int lSENS = 4;
const int whLED = 16;
int light;
int lSENS_time  = 0;

// S E T U P ###############################

void setup() {
  Serial.begin(115200);

  pinMode(rLED, OUTPUT);
  pinMode(gLED, OUTPUT);
  pinMode(yLED, OUTPUT);

  pinMode(lSENS, INPUT);
  pinMode(whLED, OUTPUT);
}

// L O O P #################################

void loop() {

  if (lSENS_time + (500) >= millis()) {
    lSENS_time = millis();
    lsens();
  }

  if (LED_time + (200) >= millis()) {
    LED_time = millis();
    led_matrix();
  }
}

// F U N C T I O N S #######################

void led_matrix() {
  Serial.println("New LED-Matrix composition:");
  if (random(2) == 1){
    digitalWrite(rLED, HIGH);
    Serial.println("  rLED : HIGH");
  }else{
    digitalWrite(rLED, LOW );
    Serial.println("  rLED : LOW");
  }
  if (random(2) == 1){
    digitalWrite(gLED, HIGH);
    Serial.println("  gLED : HIGH");
  }else{
    digitalWrite(gLED, LOW );
    Serial.println("  gLED : LOW");
  }
  if (random(2) == 1){
    digitalWrite(yLED, HIGH);
    Serial.println("  yLED : HIGH");
  }else{
    digitalWrite(yLED, LOW );
    Serial.println("  yLED : LOW");
  }
}


void lsens(){
  light = analogRead(lSENS);
  Serial.println("Light-Level:");
  Serial.println(light);
  if (light <= (500)){
    digitalWrite(whLED, HIGH);
  }else{
    digitalWrite(whLED, LOW);
  }
}

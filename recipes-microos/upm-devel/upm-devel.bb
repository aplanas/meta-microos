SUMMARY = "Development files for upm"
DESCRIPTION = "The UPM repository provides software drivers for a wide variety of commonly \
used sensors and actuators. These software drivers interact with the \
underlying hardware platform (or microcontroller), as well as with the \
attached sensors, through calls to MRAA APIs. \
 \
Programmers can access the interfaces for each sensor by including the \
sensor’s corresponding header file and instantiating the associated sensor \
class. In the typical use case, a constructor initializes the sensor based \
on parameters that identify the sensor, the I/O protocol used and the pin \
location of the sensor. \
 \
This package contains development files for upm."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "upm-devel-2.0.0-4.1.aarch64.rpm"
RPM_HASH = "0f082fc14c68cc332a1e842f86f81376a0042b2a8f9f47cf89e9329318b480506e98a323090ca9f06de98644319b1bed4431c757d77346be915fa26b73e5e44a"

RPROVIDES:${PN} += "pkgconfig(upm-2jciebu01_usb) \
pkgconfig(upm-a110x) \
pkgconfig(upm-abp) \
pkgconfig(upm-ad8232) \
pkgconfig(upm-adafruitms1438) \
pkgconfig(upm-adafruitss) \
pkgconfig(upm-adc121c021) \
pkgconfig(upm-adis16448) \
pkgconfig(upm-ads1x15) \
pkgconfig(upm-adxl335) \
pkgconfig(upm-adxl345) \
pkgconfig(upm-adxrs610) \
pkgconfig(upm-am2315) \
pkgconfig(upm-apa102) \
pkgconfig(upm-apds9002) \
pkgconfig(upm-apds9930) \
pkgconfig(upm-at42qt1070) \
pkgconfig(upm-bh1749) \
pkgconfig(upm-bh1750) \
pkgconfig(upm-bh1792) \
pkgconfig(upm-biss0001) \
pkgconfig(upm-bma220) \
pkgconfig(upm-bma250e) \
pkgconfig(upm-bmg160) \
pkgconfig(upm-bmi160) \
pkgconfig(upm-bmm150) \
pkgconfig(upm-bmp280) \
pkgconfig(upm-bmpx8x) \
pkgconfig(upm-bmx055) \
pkgconfig(upm-bno055) \
pkgconfig(upm-button) \
pkgconfig(upm-buzzer) \
pkgconfig(upm-cjq4435) \
pkgconfig(upm-collision) \
pkgconfig(upm-cwlsxxa) \
pkgconfig(upm-dfrec) \
pkgconfig(upm-dfrorp) \
pkgconfig(upm-dfrph) \
pkgconfig(upm-ds1307) \
pkgconfig(upm-ds1808lc) \
pkgconfig(upm-ds18b20) \
pkgconfig(upm-ds2413) \
pkgconfig(upm-ecezo) \
pkgconfig(upm-ecs1030) \
pkgconfig(upm-ehr) \
pkgconfig(upm-eldriver) \
pkgconfig(upm-electromagnet) \
pkgconfig(upm-emg) \
pkgconfig(upm-enc03r) \
pkgconfig(upm-flex) \
pkgconfig(upm-gas) \
pkgconfig(upm-gp2y0a) \
pkgconfig(upm-gprs) \
pkgconfig(upm-gsr) \
pkgconfig(upm-guvas12d) \
pkgconfig(upm-h3lis331dl) \
pkgconfig(upm-hcsr04) \
pkgconfig(upm-hdc1000) \
pkgconfig(upm-hdxxvxta) \
pkgconfig(upm-hka5) \
pkgconfig(upm-hlg150h) \
pkgconfig(upm-hm11) \
pkgconfig(upm-hmc5883l) \
pkgconfig(upm-hmtrp) \
pkgconfig(upm-hp20x) \
pkgconfig(upm-ht9170) \
pkgconfig(upm-htu21d) \
pkgconfig(upm-hx711) \
pkgconfig(upm-ili9341) \
pkgconfig(upm-ims) \
pkgconfig(upm-ina132) \
pkgconfig(upm-interfaces) \
pkgconfig(upm-isd1820) \
pkgconfig(upm-itg3200) \
pkgconfig(upm-jhd1313m1) \
pkgconfig(upm-joystick12) \
pkgconfig(upm-kx122) \
pkgconfig(upm-kxcjk1013) \
pkgconfig(upm-kxtj3) \
pkgconfig(upm-l298) \
pkgconfig(upm-l3gd20) \
pkgconfig(upm-lcd) \
pkgconfig(upm-lcdks) \
pkgconfig(upm-lcm1602) \
pkgconfig(upm-ldt0028) \
pkgconfig(upm-led) \
pkgconfig(upm-lidarlitev3) \
pkgconfig(upm-light) \
pkgconfig(upm-linefinder) \
pkgconfig(upm-lis2ds12) \
pkgconfig(upm-lis3dh) \
pkgconfig(upm-lm35) \
pkgconfig(upm-lol) \
pkgconfig(upm-loudness) \
pkgconfig(upm-lp8860) \
pkgconfig(upm-lpd8806) \
pkgconfig(upm-lsm303agr) \
pkgconfig(upm-lsm303d) \
pkgconfig(upm-lsm303dlh) \
pkgconfig(upm-lsm6ds3h) \
pkgconfig(upm-lsm6dsl) \
pkgconfig(upm-lsm9ds0) \
pkgconfig(upm-m24lr64e) \
pkgconfig(upm-mag3110) \
pkgconfig(upm-max30100) \
pkgconfig(upm-max31723) \
pkgconfig(upm-max31855) \
pkgconfig(upm-max44000) \
pkgconfig(upm-max44009) \
pkgconfig(upm-max5487) \
pkgconfig(upm-maxds3231m) \
pkgconfig(upm-maxsonarez) \
pkgconfig(upm-mb704x) \
pkgconfig(upm-mcp2515) \
pkgconfig(upm-mcp9808) \
pkgconfig(upm-md) \
pkgconfig(upm-mg811) \
pkgconfig(upm-mhz16) \
pkgconfig(upm-mic) \
pkgconfig(upm-micsv89) \
pkgconfig(upm-mlx90614) \
pkgconfig(upm-mma7361) \
pkgconfig(upm-mma7455) \
pkgconfig(upm-mma7660) \
pkgconfig(upm-mma8x5x) \
pkgconfig(upm-mmc35240) \
pkgconfig(upm-moisture) \
pkgconfig(upm-mpl3115a2) \
pkgconfig(upm-mpr121) \
pkgconfig(upm-mpu9150) \
pkgconfig(upm-mq303a) \
pkgconfig(upm-ms5611) \
pkgconfig(upm-ms5803) \
pkgconfig(upm-my9221) \
pkgconfig(upm-nlgpio16) \
pkgconfig(upm-nmea_gps) \
pkgconfig(upm-nrf24l01) \
pkgconfig(upm-nrf8001) \
pkgconfig(upm-nunchuck) \
pkgconfig(upm-o2) \
pkgconfig(upm-otp538u) \
pkgconfig(upm-p9813) \
pkgconfig(upm-pca9685) \
pkgconfig(upm-pn532) \
pkgconfig(upm-ppd42ns) \
pkgconfig(upm-pulsensor) \
pkgconfig(upm-relay) \
pkgconfig(upm-rf22) \
pkgconfig(upm-rfr359f) \
pkgconfig(upm-rgbringcoder) \
pkgconfig(upm-rhusb) \
pkgconfig(upm-rn2903) \
pkgconfig(upm-rotary) \
pkgconfig(upm-rotaryencoder) \
pkgconfig(upm-rpr220) \
pkgconfig(upm-rsc) \
pkgconfig(upm-scam) \
pkgconfig(upm-sensortemplate) \
pkgconfig(upm-servo) \
pkgconfig(upm-sht1x) \
pkgconfig(upm-si1132) \
pkgconfig(upm-si114x) \
pkgconfig(upm-si7005) \
pkgconfig(upm-slide) \
pkgconfig(upm-sm130) \
pkgconfig(upm-smartdrive) \
pkgconfig(upm-speaker) \
pkgconfig(upm-ssd1351) \
pkgconfig(upm-st7735) \
pkgconfig(upm-stepmotor) \
pkgconfig(upm-sx1276) \
pkgconfig(upm-sx6119) \
pkgconfig(upm-t6713) \
pkgconfig(upm-ta12200) \
pkgconfig(upm-tca9548a) \
pkgconfig(upm-tcs3414cs) \
pkgconfig(upm-tcs37727) \
pkgconfig(upm-teams) \
pkgconfig(upm-temperature) \
pkgconfig(upm-tex00) \
pkgconfig(upm-th02) \
pkgconfig(upm-tm1637) \
pkgconfig(upm-tmp006) \
pkgconfig(upm-tsl2561) \
pkgconfig(upm-ttp223) \
pkgconfig(upm-uartat) \
pkgconfig(upm-uln200xa) \
pkgconfig(upm-ultrasonic) \
pkgconfig(upm-urm37) \
pkgconfig(upm-utilities) \
pkgconfig(upm-vcap) \
pkgconfig(upm-vdiv) \
pkgconfig(upm-veml6070) \
pkgconfig(upm-water) \
pkgconfig(upm-waterlevel) \
pkgconfig(upm-wfs) \
pkgconfig(upm-wheelencoder) \
pkgconfig(upm-wt5001) \
pkgconfig(upm-xbee) \
pkgconfig(upm-yg1006) \
pkgconfig(upm-zfm20) \
pkgconfig(upmc-a110x) \
pkgconfig(upmc-abp) \
pkgconfig(upmc-ad8232) \
pkgconfig(upmc-apa102) \
pkgconfig(upmc-bh1749) \
pkgconfig(upmc-bh1750) \
pkgconfig(upmc-bh1792) \
pkgconfig(upmc-biss0001) \
pkgconfig(upmc-bma250e) \
pkgconfig(upmc-bmg160) \
pkgconfig(upmc-bmi160) \
pkgconfig(upmc-bmm150) \
pkgconfig(upmc-bmp280) \
pkgconfig(upmc-bmpx8x) \
pkgconfig(upmc-bno055) \
pkgconfig(upmc-button) \
pkgconfig(upmc-buzzer) \
pkgconfig(upmc-cjq4435) \
pkgconfig(upmc-collision) \
pkgconfig(upmc-dfrec) \
pkgconfig(upmc-dfrorp) \
pkgconfig(upmc-dfrph) \
pkgconfig(upmc-ds18b20) \
pkgconfig(upmc-ecezo) \
pkgconfig(upmc-emg) \
pkgconfig(upmc-enc03r) \
pkgconfig(upmc-flex) \
pkgconfig(upmc-gas) \
pkgconfig(upmc-gp2y0a) \
pkgconfig(upmc-gsr) \
pkgconfig(upmc-guvas12d) \
pkgconfig(upmc-hcsr04) \
pkgconfig(upmc-hka5) \
pkgconfig(upmc-hmc5883l) \
pkgconfig(upmc-ims) \
pkgconfig(upmc-jhd1313m1) \
pkgconfig(upmc-joystick12) \
pkgconfig(upmc-kx122) \
pkgconfig(upmc-kxtj3) \
pkgconfig(upmc-lcdks) \
pkgconfig(upmc-lcm1602) \
pkgconfig(upmc-ldt0028) \
pkgconfig(upmc-led) \
pkgconfig(upmc-light) \
pkgconfig(upmc-linefinder) \
pkgconfig(upmc-lis2ds12) \
pkgconfig(upmc-lis3dh) \
pkgconfig(upmc-lm35) \
pkgconfig(upmc-loudness) \
pkgconfig(upmc-lsm303agr) \
pkgconfig(upmc-lsm303d) \
pkgconfig(upmc-lsm6ds3h) \
pkgconfig(upmc-lsm6dsl) \
pkgconfig(upmc-m24lr64e) \
pkgconfig(upmc-max30100) \
pkgconfig(upmc-mb704x) \
pkgconfig(upmc-mcp2515) \
pkgconfig(upmc-md) \
pkgconfig(upmc-mic) \
pkgconfig(upmc-mma7361) \
pkgconfig(upmc-mma7660) \
pkgconfig(upmc-moisture) \
pkgconfig(upmc-mpr121) \
pkgconfig(upmc-mq303a) \
pkgconfig(upmc-ms5803) \
pkgconfig(upmc-my9221) \
pkgconfig(upmc-nmea_gps) \
pkgconfig(upmc-nunchuck) \
pkgconfig(upmc-o2) \
pkgconfig(upmc-otp538u) \
pkgconfig(upmc-p9813) \
pkgconfig(upmc-ppd42ns) \
pkgconfig(upmc-relay) \
pkgconfig(upmc-rn2903) \
pkgconfig(upmc-rotary) \
pkgconfig(upmc-rotaryencoder) \
pkgconfig(upmc-rpr220) \
pkgconfig(upmc-rsc) \
pkgconfig(upmc-servo) \
pkgconfig(upmc-sht1x) \
pkgconfig(upmc-slide) \
pkgconfig(upmc-speaker) \
pkgconfig(upmc-temperature) \
pkgconfig(upmc-tsl2561) \
pkgconfig(upmc-ttp223) \
pkgconfig(upmc-uartat) \
pkgconfig(upmc-uln200xa) \
pkgconfig(upmc-urm37) \
pkgconfig(upmc-utilities) \
pkgconfig(upmc-vdiv) \
pkgconfig(upmc-veml6070) \
pkgconfig(upmc-water) \
pkgconfig(upmc-wfs) \
pkgconfig(upmc-yg1006) \
upm-devel \
upm-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupm1 \
pkgconfig(libjpeg) \
pkgconfig(mraa) \
pkgconfig(upm-bma250e) \
pkgconfig(upm-bmg160) \
pkgconfig(upm-bmm150) \
pkgconfig(upm-ds18b20) \
pkgconfig(upm-lcm1602) \
pkgconfig(upm-pca9685) \
pkgconfig(upm-utilities) \
pkgconfig(upmc-a110x) \
pkgconfig(upmc-abp) \
pkgconfig(upmc-ad8232) \
pkgconfig(upmc-bh1749) \
pkgconfig(upmc-bh1750) \
pkgconfig(upmc-bh1792) \
pkgconfig(upmc-biss0001) \
pkgconfig(upmc-bma250e) \
pkgconfig(upmc-bmg160) \
pkgconfig(upmc-bmi160) \
pkgconfig(upmc-bmm150) \
pkgconfig(upmc-bmp280) \
pkgconfig(upmc-bmpx8x) \
pkgconfig(upmc-bno055) \
pkgconfig(upmc-buzzer) \
pkgconfig(upmc-cjq4435) \
pkgconfig(upmc-collision) \
pkgconfig(upmc-dfrec) \
pkgconfig(upmc-dfrorp) \
pkgconfig(upmc-dfrph) \
pkgconfig(upmc-ds18b20) \
pkgconfig(upmc-ecezo) \
pkgconfig(upmc-enc03r) \
pkgconfig(upmc-gp2y0a) \
pkgconfig(upmc-guvas12d) \
pkgconfig(upmc-hcsr04) \
pkgconfig(upmc-hka5) \
pkgconfig(upmc-hmc5883l) \
pkgconfig(upmc-ims) \
pkgconfig(upmc-jhd1313m1) \
pkgconfig(upmc-kx122) \
pkgconfig(upmc-kxtj3) \
pkgconfig(upmc-lcdks) \
pkgconfig(upmc-lcm1602) \
pkgconfig(upmc-led) \
pkgconfig(upmc-light) \
pkgconfig(upmc-linefinder) \
pkgconfig(upmc-lis2ds12) \
pkgconfig(upmc-lis3dh) \
pkgconfig(upmc-lm35) \
pkgconfig(upmc-loudness) \
pkgconfig(upmc-lsm303agr) \
pkgconfig(upmc-lsm303d) \
pkgconfig(upmc-lsm6ds3h) \
pkgconfig(upmc-lsm6dsl) \
pkgconfig(upmc-m24lr64e) \
pkgconfig(upmc-max30100) \
pkgconfig(upmc-mb704x) \
pkgconfig(upmc-mcp2515) \
pkgconfig(upmc-md) \
pkgconfig(upmc-mma7361) \
pkgconfig(upmc-mma7660) \
pkgconfig(upmc-moisture) \
pkgconfig(upmc-mpr121) \
pkgconfig(upmc-mq303a) \
pkgconfig(upmc-ms5803) \
pkgconfig(upmc-my9221) \
pkgconfig(upmc-nmea_gps) \
pkgconfig(upmc-nunchuck) \
pkgconfig(upmc-otp538u) \
pkgconfig(upmc-ppd42ns) \
pkgconfig(upmc-rn2903) \
pkgconfig(upmc-rotaryencoder) \
pkgconfig(upmc-rpr220) \
pkgconfig(upmc-rsc) \
pkgconfig(upmc-servo) \
pkgconfig(upmc-sht1x) \
pkgconfig(upmc-speaker) \
pkgconfig(upmc-tsl2561) \
pkgconfig(upmc-ttp223) \
pkgconfig(upmc-uartat) \
pkgconfig(upmc-uln200xa) \
pkgconfig(upmc-urm37) \
pkgconfig(upmc-utilities) \
pkgconfig(upmc-veml6070) \
pkgconfig(upmc-water) \
pkgconfig(upmc-wfs) \
pkgconfig(upmc-yg1006)"

inherit rpm

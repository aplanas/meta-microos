SUMMARY = "Configuration for the Raspberry Pi firmware loader"
DESCRIPTION = "This package configures the Raspberry Pi boot process. \
2 flavors are available: \
  * raspberrypi-firmware-config - the default config \
  * raspberrypi-firmware-config-camera - the config which enables \
  start_x=1 and increase gpu_mem to be able to use a camera module \
 \
Note: config.txt should not be used to set manually params (gpu_mem, etc.) \
please create extraconfig.txt instead."
LICENSE = "MIT"

PV = "2023.04.25"

RPM_NAME = "raspberrypi-firmware-config-2023.04.25-2.1.noarch.rpm"
RPM_HASH = "6d58f82689da5c73effbeee840526c00bcff9a3c7c84441e2e970a00c8ce31c12ef7632093bdfc36ac5ce0f0b9983ee2fc4a0213382bec9408d5744c1cb9c08c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(raspberrypi-firmware-config) raspberrypi-firmware-branding-openSUSE raspberrypi-firmware-config raspberrypi-firmware-config-rpi raspberrypi-firmware-config-rpi0w raspberrypi-firmware-config-rpi2 raspberrypi-firmware-config-rpi3"
RDEPENDS:${PN} += "/bin/sh raspberrypi-firmware"

inherit rpm

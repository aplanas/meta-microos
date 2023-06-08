SUMMARY = "jeos-firstboot module for WiFi configuration for RaspberryPi systems"
DESCRIPTION = "This module hooks into jeos-firstboot and allows the user to enter data to connect \
his RaspberryPi system to a wireless network."
LICENSE = "MIT"

PV = "1.2.0.5"

RPM_NAME = "jeos-firstboot-rpiwifi-1.2.0.5-1.1.noarch.rpm"
RPM_HASH = "f443ee1bb8c80eb1828b6cfb7d1212078aca93d24728ee6de31b41d9faf867028ae608d952fb05169257f0e51c9bda5f4fcd790ab746194797a2efe82c2f1410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeos-firstboot-rpiwifi"
RDEPENDS:${PN} += "jeos-firstboot wicked wireless-tools wpa_supplicant"

inherit rpm

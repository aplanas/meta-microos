SUMMARY = "Mobile Service Provider Database"
DESCRIPTION = "This package contains mobile broadband settings for different service \
providers in different countries."
LICENSE = "SUSE-Public-Domain"

PV = "20230416"

RPM_NAME = "mobile-broadband-provider-info-20230416-1.1.noarch.rpm"
RPM_HASH = "9518f15da37b41b5d9b1cc7a93129be1631a1bd6c04361e3f49adb3eac9155de3a1a52d8147e6c256368e7d5d7941a8123ef9bba238e7254825cd9eed7c79751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mobile-broadband-provider-info pkgconfig(mobile-broadband-provider-info)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm

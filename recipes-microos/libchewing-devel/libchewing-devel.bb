SUMMARY = "Development package for chewing"
DESCRIPTION = "Development package for chewing (An Intelligent phonetic input method library for traditional Chinese)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "libchewing-devel-0.5.1+git20200627.452f622-1.9.aarch64.rpm"
RPM_HASH = "1f31d7dae9dbea3d203ae0793ae09e3971e5905a5adb17656dc3b01683165167aa89620bd80d5c1ddd492016f2ce02c0ceab2c046076a362b0962eb3a85fd7d8"

RPROVIDES:${PN} += "libchewing-devel \
libchewing-devel(aarch-64) \
pkgconfig(chewing)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchewing3 \
python-chewing"

inherit rpm

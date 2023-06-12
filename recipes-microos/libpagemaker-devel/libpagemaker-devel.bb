SUMMARY = "Files for Developing with libpagemaker"
DESCRIPTION = "libpagemaker is library providing ability to interpret and import \
Adobe PageMaker documents into various applications. \
 \
This package contains the libpagemaker development files."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-devel-0.0.4-1.29.aarch64.rpm"
RPM_HASH = "43f6a1e9a549703dc33dc4eeec08bd9201588a349aa07d8f01f3c853b67909a85ba33d06ce053c4180b55c717686e835a573f4b58777a75600d031092702871e"

RPROVIDES:${PN} += "libpagemaker-devel \
libpagemaker-devel(aarch-64) \
pkgconfig(libpagemaker-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpagemaker-0_0-0 \
pkgconfig(librevenge-0.0) \
pkgconfig(librevenge-stream-0.0)"

inherit rpm

SUMMARY = "Header files for librtr"
DESCRIPTION = "Development and header files for librtr."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rtrlib-devel-0.8.0-1.8.aarch64.rpm"
RPM_HASH = "a5a1c9a30e4dcc4924e1efb231bc639817b28cc8bfdd0fc24971d4dc0da41fc7d5b72c4fa3b973b2931ebde5cf1b3210b6fcefbb36e97c8929c64ce3f05fc84f"

RPROVIDES:${PN} += "pkgconfig(rtrlib) \
rtrlib-devel \
rtrlib-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtr0"

inherit rpm

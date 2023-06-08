SUMMARY = "Development tools for ISL"
DESCRIPTION = "Development tools and headers for the ISL."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "isl-devel-0.26-1.1.aarch64.rpm"
RPM_HASH = "4535aa60bbc6c62ba9de2ecf7482e4bc83b338f4b7b482f15abb905256b5dec7007990a07c1cc372f9ffe294deab4cbabbcecf925626753b6cf94943b9ace1dd"

RPROVIDES:${PN} += "isl-devel isl-devel(aarch-64) pkgconfig(isl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libisl23"

inherit rpm

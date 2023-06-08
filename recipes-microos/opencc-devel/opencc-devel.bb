SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides development headers for OpenCC."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "opencc-devel-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "e46af3c4054414a4348c561d10e395939678ad05c1c8eb8b9a6b52b7deffb222a235a0e4b6422b15606acf399138c71e2d8477384b64528564cf449a802584d9"

RPROVIDES:${PN} += "opencc-devel opencc-devel(aarch-64) pkgconfig(opencc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config opencc"

inherit rpm

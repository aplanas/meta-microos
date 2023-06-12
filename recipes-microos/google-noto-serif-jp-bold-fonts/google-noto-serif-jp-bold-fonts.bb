SUMMARY = "Noto Serif Japanese Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bold weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-bold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "b8933f5650e2756917b80e71efce8f316fe9d6e12f625ca90f8ac04cfe577d3fcfc6b55570ca5e312d5aa00f11148728dd9621433bedc95aae7ef33d8a3f80c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-bold-fonts \
noto-serif-jp-bold-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm

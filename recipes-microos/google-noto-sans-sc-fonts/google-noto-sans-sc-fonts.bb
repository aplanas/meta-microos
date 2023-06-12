SUMMARY = "Noto Sans Simplified Chinese Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular and Bold \
weights of Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "f3199af725a51b3ef6dbb2c82f1f5e31296ca97898d8e91b6c5c50c872ece21a35029f93271534ad9eb05f1426882cf44dbe14600f01ef7b7ad7fdbfd5519cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-fonts \
locale(zh_CN;zh_SG) \
noto-sans-cjksc \
noto-sans-cjksc-fonts \
noto-sans-sc-fonts \
scalable-font-zh-CN \
scalable-font-zh-SG"
RDEPENDS:${PN} += "google-noto-sans-sc-bold-fonts \
google-noto-sans-sc-regular-fonts"

inherit rpm

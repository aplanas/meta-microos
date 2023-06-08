SUMMARY = "Noto Serif Simplified Chinese Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular and Bold weights of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "ca2dadba14b9338e77f760c9b157c85a240111ba1168bfda551226aafcd8f673678adde9ef7c78b58392b93257ad69e4be3fbc83b0f10f7005ef4fcff18e84e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-fonts locale(zh_CN;zh_SG) noto-serif-sc-fonts scalable-font-zh-CN scalable-font-zh-SG"
RDEPENDS:${PN} += "google-noto-serif-sc-bold-fonts google-noto-serif-sc-regular-fonts"

inherit rpm

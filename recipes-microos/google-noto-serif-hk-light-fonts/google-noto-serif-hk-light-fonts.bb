SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Light weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-light-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "5a01f691a971ad371e7844dad6f7315972c54c0cd40d90fbb50752463895334daed8878a06c2b20d8789970cfb53dbfe188fdd0cc71302a189a04b1ab628cf71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-light-fonts noto-serif-hk-light-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm

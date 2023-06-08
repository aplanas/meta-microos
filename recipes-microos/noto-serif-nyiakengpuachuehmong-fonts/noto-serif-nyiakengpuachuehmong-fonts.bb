SUMMARY = "Noto Nyiakeng Puachue Hmong Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NyiakengPuachueHmong Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-nyiakengpuachuehmong-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2bd0be68439bd57a155c68140457f7800412b21a191567bfe793545438468385a113fdf0aa2539a74eb45c6516969e8a45692517d9aea430a5adbd5c1588dac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-nyiakengpuachuehmong noto-serif-nyiakengpuachuehmong-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm

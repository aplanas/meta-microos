SUMMARY = "Korean"
DESCRIPTION = "Support for Korean; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-collection-langkorean-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "467603df5ebd5005f286f7cf5b49167eb2298987a24dbfe08e7c93f7c2b3f496b3a5df1467457f85a37d1410614d7aacc05db065fae13585e9859867894a6ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langkorean"
RDEPENDS:${PN} += "texlive-baekmuk texlive-cjk-ko texlive-collection-langcjk texlive-kotex-oblivoir texlive-kotex-plain texlive-kotex-utf texlive-kotex-utils texlive-lshort-korean texlive-nanumtype1 texlive-pmhanguljamo texlive-uhc texlive-unfonts-core texlive-unfonts-extra"

inherit rpm

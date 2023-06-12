SUMMARY = "Binary files of jfmutil"
DESCRIPTION = "Binary files of jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44835"

RPM_NAME = "texlive-jfmutil-bin-2023.20230311.svn44835-91.1.aarch64.rpm"
RPM_HASH = "6a1865c431374238ef229e96436034943511d42ba6bd47b42b3e0f5077761ab679641f5bc7768ff63cd2e753235878fe3792207ec61738b60b619f46ab16f50a"

RPROVIDES:${PN} += "texlive-jfmutil-bin texlive-jfmutil-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-jfmutil"

inherit rpm

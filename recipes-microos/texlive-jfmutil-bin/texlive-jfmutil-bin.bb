SUMMARY = "Binary files of jfmutil"
DESCRIPTION = "Binary files of jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44835"

RPM_NAME = "texlive-jfmutil-bin-2023.20230311.svn44835-89.1.aarch64.rpm"
RPM_HASH = "b18064163a9a1a1d832338e3a54dc04d54808290a4df0a7467aeac283980625ed7a4f1c6cc76da6980531e408515d1193da9b956d86e367dc0853e65aae7d214"

RPROVIDES:${PN} += "texlive-jfmutil-bin texlive-jfmutil-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-jfmutil"

inherit rpm

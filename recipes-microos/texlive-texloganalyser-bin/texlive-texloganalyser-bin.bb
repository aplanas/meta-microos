SUMMARY = "Binary files of texloganalyser"
DESCRIPTION = "Binary files of texloganalyser"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-texloganalyser-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "edd345ab1adca1a969be09621122f739dbe7a7e898686b49a3e9ecbc67dc5863903537c3737613643291bd68d6603d57373d620ba00473c4f228246c8fb7ea21"

RPROVIDES:${PN} += "texlive-texloganalyser-bin texlive-texloganalyser-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texloganalyser"

inherit rpm

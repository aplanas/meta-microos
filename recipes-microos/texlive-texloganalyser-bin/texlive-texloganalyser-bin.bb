SUMMARY = "Binary files of texloganalyser"
DESCRIPTION = "Binary files of texloganalyser"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-texloganalyser-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "063818e98e5dbebd426e4156e69f80f6b526e0977fdb15147593b6328de52704bc19731d3effd544db6c269d5cc7c0113b46220ac7c8264e09d66f1fe9e735f4"

RPROVIDES:${PN} += "texlive-texloganalyser-bin \
texlive-texloganalyser-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texloganalyser"

inherit rpm

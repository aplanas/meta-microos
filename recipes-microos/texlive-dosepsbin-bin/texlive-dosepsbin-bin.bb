SUMMARY = "Binary files of dosepsbin"
DESCRIPTION = "Binary files of dosepsbin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24759"

RPM_NAME = "texlive-dosepsbin-bin-2023.20230311.svn24759-89.1.aarch64.rpm"
RPM_HASH = "11cd7780401c982b4683145edf4f1b645e845be39ba4ffb31932127fdde83287dbb5498cb5ad14600afe970816298a87e2b2149998f44412aebcbe508bdc7910"

RPROVIDES:${PN} += "texlive-dosepsbin-bin texlive-dosepsbin-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-dosepsbin"

inherit rpm

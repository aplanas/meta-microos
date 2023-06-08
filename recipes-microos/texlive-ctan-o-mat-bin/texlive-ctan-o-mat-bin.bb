SUMMARY = "Binary files of ctan-o-mat"
DESCRIPTION = "Binary files of ctan-o-mat"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46996"

RPM_NAME = "texlive-ctan-o-mat-bin-2023.20230311.svn46996-89.1.aarch64.rpm"
RPM_HASH = "f1af785a46aecb1c148babb9ef6922778cfb138a880dd7c07b129fb9fe44085da2db42f2cdd0eb26804b0421aabe66acccc90ac1ec9278bb5da72af1bd1103a1"

RPROVIDES:${PN} += "texlive-ctan-o-mat-bin texlive-ctan-o-mat-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ctan-o-mat"

inherit rpm

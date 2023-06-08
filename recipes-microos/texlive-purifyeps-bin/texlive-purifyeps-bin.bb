SUMMARY = "Binary files of purifyeps"
DESCRIPTION = "Binary files of purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-purifyeps-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "1ab81649466f282af55e991111e0f68afdac5017b2d8fe2e17c6e4cccbae20c43010b86db0f2a97e3cbf8eec1898fbbc669b8eca828e954925c1d910079ad5b1"

RPROVIDES:${PN} += "texlive-purifyeps-bin texlive-purifyeps-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-purifyeps"

inherit rpm

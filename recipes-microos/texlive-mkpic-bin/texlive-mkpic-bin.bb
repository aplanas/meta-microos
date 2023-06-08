SUMMARY = "Binary files of mkpic"
DESCRIPTION = "Binary files of mkpic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33688"

RPM_NAME = "texlive-mkpic-bin-2023.20230311.svn33688-89.1.aarch64.rpm"
RPM_HASH = "364e900df74c1ca1a12fff52c14afbe969ec7db9bcefdb4cd7f57aebc74bb88b2cbbba693792a269e442a2dcc9eefa4e1f0442c7c8a792ea10579ec821517112"

RPROVIDES:${PN} += "texlive-mkpic-bin texlive-mkpic-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mkpic"

inherit rpm

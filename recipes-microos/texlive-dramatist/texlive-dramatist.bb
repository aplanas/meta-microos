SUMMARY = "Typeset dramas, both in verse and in prose"
DESCRIPTION = "This package is intended for typesetting drama of any length. \
It provides two environments for typesetting dialogues in prose \
or in verse; new document divisions corresponding to acts and \
scenes; macros that control the appearance of characters and \
stage directions; and automatic generation of a `dramatis \
personae' list."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2esvn35866"

RPM_NAME = "texlive-dramatist-2023.201.1.2esvn35866-52.1.noarch.rpm"
RPM_HASH = "6bae3e9667d67ed462d4440ee19aa3957910f5a57820becf2f2a24cc2c470b61f551c42cd890480b149eb19ad7bb19bc98a0d87390eba861a67f5857d1093215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dramatist.sty) texlive-dramatist"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

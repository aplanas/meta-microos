SUMMARY = "Latex input method for IBus framework"
DESCRIPTION = "ibus-table-latex provides Latex input method on IBus Table under IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-latex-1.3.13-2.3.noarch.rpm"
RPM_HASH = "30b2c205d08d93a965c9df9d6b0eb57e6f51015b4cd3ed07fff1398b9f22f9ae652201e320733b9175b4b85b43a79e428150c2f793849e1bf9ac865d0654346e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-latex"
RDEPENDS:${PN} += "ibus-table"

inherit rpm

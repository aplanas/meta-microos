SUMMARY = "Perl extensions for the rxvt-unicode terminal emulator"
DESCRIPTION = "A small collection of perl extensions for the urxvt-unicode terminal emulator. \
keyboard-select: Use keyboard shortcuts to select and copy text. \
url-select: Use keyboard shortcuts to select URLs. \
clipboard: Use keyboard shortcuts to copy the selection to the clipboard and \
to paste the clipboard contents (optionally escaping all special characters)."
LICENSE = "GPL-2.0"

PV = "2.3"

RPM_NAME = "urxvt-perls-2.3-1.4.aarch64.rpm"
RPM_HASH = "37d05e277f8b107cd9ead35430d1faf8e5be4da26cc48bc0450da9740206580d9400c7a7f8d8b5dd6ab6ea23c53f65a100e52406d1b479992ed534b4ee770faf"

RPROVIDES:${PN} += "urxvt-perls urxvt-perls(aarch-64)"
RDEPENDS:${PN} += "xsel"

inherit rpm

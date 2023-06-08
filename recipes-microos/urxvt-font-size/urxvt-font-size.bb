SUMMARY = "Extension for rxvt-unicode that allows changing the font size on the fly"
DESCRIPTION = "A perl extension for rxvt-unicode that allows changing the font size on the fly \
with keyboard shortcuts. It has the following features: \
 - Supports both xft and X11 fonts; X11 fonts work in both full form and as \
   aliases. \
 - Supports all four font settings: font, boldFont, italicFont and \
   boldItalicFont and changes them in accordance with the base font (the first \
   one from font). \
 - Can apply the font change globally for the whole server, so that new \
   terminals will inherit the same size, and even save it to ~/.Xresources to \
   be able to survive a reboot. \
 - Should work even with complicated font setups like the example in the urxvt \
   man-page."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "urxvt-font-size-1.3-1.4.aarch64.rpm"
RPM_HASH = "674e262be06f1ad498716e596cb64f635dfba430d6a05f06493b2a924cca45a911a13bd236030570f648b41b8c085fb272c72a1a82e58e0f7f2804eb4c266ca8"

RPROVIDES:${PN} += "urxvt-font-size urxvt-font-size(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

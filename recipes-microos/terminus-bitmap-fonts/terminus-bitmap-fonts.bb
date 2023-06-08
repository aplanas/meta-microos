SUMMARY = "Readable Fixed Width Fonts for X11 and the Linux Console"
DESCRIPTION = "Terminus Font is a geometric sans-serif font designed for long (8 and \
more hours per day) work with computers. Version 4.03 contains 538 \
characters, covering code pages ISO8859-1/2/5/9/15/16, \
Windows-1250/1251/1252/1254, IBM-437/852/855/866, KOI8-R/U/E/F, \
Bulgarian-MIK, Paratype-PT154/PT254 and Macintosh-Ukrainian, and also \
the vt100 and xterm pseudographic characters. \
 \
The sizes and styles present are 8x14-normal, 8x14-bold, \
8x14-EGA/VGA-bold, 8x16-normal, 8x16-bold, 8x16-EGA/VGA-bold, \
10x20-normal, 10x20-bold, 12x24-normal, 12x24-bold and 14x28-normal \
(whose weight is actually between normal and bold). \
 \
This package installs the font(s) in psf format (Linux console) \
and pcf (usable with e.g. libXft/xterm). \
 \
Pango (used by e.g. libvte/gnome-terminal/etc.) does not support pcf \
(anymore). Use the consoleet-terminus-fonts package in this case."
LICENSE = "OFL-1.1"

PV = "4.49.1"

RPM_NAME = "terminus-bitmap-fonts-4.49.1-2.6.noarch.rpm"
RPM_HASH = "648ce520b06e810107bd1566938637dab222c2ee77527fcfeb573fb6d5659a63d4706e2c8b348d94569be6b57846bc2d22d4ece2d41fc4203f612bc27938fd70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(ru;bg) terminus-bitmap-fonts terminus-font"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm

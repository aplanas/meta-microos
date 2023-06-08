SUMMARY = "Data files for Rocks'n'Diamonds"
DESCRIPTION = "This is a nice little game with color graphics and sound for your Unix system \
with color X11.  You need an 8-Bit color display or better.  It will not work \
on black&white systems, and maybe not on gray scale systems. \
 \
If you know the game Boulder Dash (Commodore C64) or Emerald Mine (Amiga), \
you know what Rocks'n'Diamonds is about. \
 \
Data files (levels, tapes, graphics, music, sound) for Rocks'n'Diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "20220526"

RPM_NAME = "rocksndiamonds-data-20220526-1.3.noarch.rpm"
RPM_HASH = "9acb4ba62bc57eb4fc45463d65bd354ecbd035a8a472a3d595263090f58f8f7d92a5564ace87a8213d9b7cb7cd45af59fcf8d68c2756be2895a4b0eac4ff3a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rocksndiamonds-data"
RDEPENDS:${PN} += "/bin/sh rocksndiamonds"

inherit rpm

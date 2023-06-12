SUMMARY = "STIX scientific and engineering fonts, PUA glyphs"
DESCRIPTION = "This package includes fonts containing glyphs called out from the Unicode \
Private Use Area (PUA) range. Glyphs in this range do not have an official \
Unicode codepoint. They're generally accessible only through specialised \
software. Text using them will break if they're ever accepted by the Unicode \
Consortium and moved to an official codepoint."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-pua-fonts-1.1.0-12.18.noarch.rpm"
RPM_HASH = "70ee3d5789c915a68854b2e0787c717f59a5d5b5d1c2496e79b122abcc94feb6f921784e80f7fd9a44af9ed321ae564ebd93d89efd1a8f59deb75330af1da07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(stix-pua-fonts) \
font(stixnonunicode) \
stix-pua-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl \
stix-fonts"

inherit rpm

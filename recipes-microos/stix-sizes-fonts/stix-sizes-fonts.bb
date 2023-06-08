SUMMARY = "STIX scientific and engineering fonts, additional glyph sizes"
DESCRIPTION = "This package includes fonts containing glyphs in additional sizes (Mostly \
'fence' and 'piece' glyphs)."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-sizes-fonts-1.1.0-12.18.noarch.rpm"
RPM_HASH = "9d2fc9dca155fe183d3036c2e81aee96d1c2366e5fe3609daf636da8f1693191c1bb03b5e4c9a8163b1f628af42e6b9ffc8d98e40c79514caf671169bd3292fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(stix-sizes-fonts) font(stixsizefivesym) font(stixsizefoursym) font(stixsizeonesym) font(stixsizethreesym) font(stixsizetwosym) stix-sizes-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl stix-fonts"

inherit rpm

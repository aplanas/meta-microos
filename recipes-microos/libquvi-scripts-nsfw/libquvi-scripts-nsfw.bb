SUMMARY = "Not Safe For Work Lua scripts used by libquvi"
DESCRIPTION = "Website fetching scripts used by libquvi-scripts that are marked as 'NSFW' \
(Not Safe For Work)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.20131130"

RPM_NAME = "libquvi-scripts-nsfw-0.9.20131130-4.7.aarch64.rpm"
RPM_HASH = "4c8ea47f3b24a980b3074cb25b855469cf636fc4e50892763b1ff918c73e605f501c619eabbf4e9089c6f5638bbffc5d7c525ff9028d532b9916a855b1fe1b3c"

RPROVIDES:${PN} += "libquvi-scripts-nsfw libquvi-scripts-nsfw(aarch-64)"
RDEPENDS:${PN} += "libquvi-scripts"

inherit rpm

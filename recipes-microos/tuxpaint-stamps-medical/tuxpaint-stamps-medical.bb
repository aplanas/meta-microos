SUMMARY = "Medical stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-medical package contains a set of 'Rubber Stamp' \
images which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-medical-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "398dcca9d8dffdbf27782b0068ca4e7b09ff8255357c754ce812bb8e4116d9f91d5e157e26ad74e70ccc1f7c4927f58a3ea6041af7e1597ed9b267a1edb4d4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category tuxpaint-stamps-medical"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm

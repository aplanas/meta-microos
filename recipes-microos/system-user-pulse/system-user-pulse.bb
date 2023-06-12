SUMMARY = "System user for PulseAudio"
DESCRIPTION = "System user for PulseAudio"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "system-user-pulse-16.1-3.1.noarch.rpm"
RPM_HASH = "932cbb4043103c1bbfbe0b4d60de1990680ddc46526100865ff6ecaeb67123763796f936af0cc5cda9dbdb74f97d49139d31b498bf616e65dfde4485a969aa93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(pulse) \
group(pulse-access) \
system-user-pulse \
user(pulse)"
RDEPENDS:${PN} += "/bin/sh \
group(audio) \
sysuser-shadow"

inherit rpm

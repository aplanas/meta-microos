SUMMARY = "Python ntpsec bindings"
DESCRIPTION = "The ntpsec python bindings used by various ntp utilities."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "python3-ntp-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "f887ed8dcab962b3d4982aa751bfc41a91bb257bc14a0b41ce332e9d99d2b2b3c68120e31a2737bed266bcd833c074a18019b6c9408ba4b0bdf10e8d04dfb6ea"

RPROVIDES:${PN} += "python3-ntp python3-ntp(aarch-64) python3.10dist(ntpsec) python3dist(ntpsec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

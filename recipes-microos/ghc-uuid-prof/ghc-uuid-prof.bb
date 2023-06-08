SUMMARY = "Haskell uuid profiling library"
DESCRIPTION = "This package provides the Haskell uuid profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-prof-1.3.15-4.3.aarch64.rpm"
RPM_HASH = "cf726de600330c3653b1bbb95e311db285302558864232d0d00cbde65f6e49af003ff86417f2a19ab56d9bc1befc8102282392db8fe1aa5affad693ed50b66ca"

RPROVIDES:${PN} += "ghc-prof(uuid-1.3.15-LYRljjihV0KIEewDtLdQ17) ghc-uuid-prof ghc-uuid-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV) ghc-prof(cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb) ghc-prof(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) ghc-prof(network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I) ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-prof(text-2.0.2) ghc-prof(time-1.12.2) ghc-prof(uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM) ghc-uuid-devel"

inherit rpm

SUMMARY = "Haskell wai-cors profiling library"
DESCRIPTION = "This package provides the Haskell wai-cors profiling library."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-prof-0.2.7-1.2.aarch64.rpm"
RPM_HASH = "3c8353ad6292ba2a6fc2257e896351e177fbe2afd6a6b97fc4811219d05817e475aea2313463be0443d2517e372825eb19e81464c389ce9b890cbe3300cbc802"

RPROVIDES:${PN} += "ghc-prof(wai-cors-0.2.7-CSepwpjFO1f9DnlkYc71mV) \
ghc-wai-cors-prof \
ghc-wai-cors-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(mtl-2.2.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-wai-cors-devel"

inherit rpm

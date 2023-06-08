SUMMARY = "Zathura fish completion"
DESCRIPTION = "Optional dependency offering fish completion for zathura"
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-fish-completion-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "5eeddb6b6e723e2fcf028cfcb083aafa5a574759c2caa87e18bc9abe36b8f91bfbc0f8c1753d3ca7a581d232b7e4d1936f4a2c4a4fa9841730953bc205743c72"

RPROVIDES:${PN} += "zathura-fish-completion zathura-fish-completion(aarch-64)"
RDEPENDS:${PN} += "fish zathura"

inherit rpm

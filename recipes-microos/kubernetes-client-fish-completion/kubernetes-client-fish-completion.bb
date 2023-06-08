SUMMARY = "Kubectl completion for fish shell"
DESCRIPTION = "Kubectl completion for fish shell"
LICENSE = "MIT"

PV = "0.1604972537+git.da5fa3c"

RPM_NAME = "kubernetes-client-fish-completion-0.1604972537+git.da5fa3c-1.7.noarch.rpm"
RPM_HASH = "5ff3523e412b8a7d668d0b1cfa231514f43113038a2b3242e5cfa96f840fd30136556aa606dd5ccc0cfc70ae7bc189157f00c12ab6c0bdb0157251cc742e0d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm

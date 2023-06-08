SUMMARY = "Shells.com command line interface"
DESCRIPTION = "Command line tool for interacting with the Shells.com backend system."
LICENSE = "MIT"

PV = "0~20210507"

RPM_NAME = "shells-cli-0~20210507-1.9.aarch64.rpm"
RPM_HASH = "17d59b705889288e821896f80853d9009d7d48d0810d74707b7d8027036ef90700ae8f928dbe866274e2eadb3ec27305b68d61c97656a6f88a00d30f7092832c"

RPROVIDES:${PN} += "shells-cli shells-cli(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

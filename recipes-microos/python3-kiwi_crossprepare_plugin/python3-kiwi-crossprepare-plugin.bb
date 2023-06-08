SUMMARY = "KIWI - Cross Image Arch Prepare Plugin"
DESCRIPTION = "Prepare an image root tree for a cross architecture build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "python3-kiwi_crossprepare_plugin-0.1.5-11.7.aarch64.rpm"
RPM_HASH = "b9fa6ab6aabe513642bce0afd6a390b490725d3971179c2e2ebba77fe0ea1374c014eed684edf11eb3acbc3fe5b5b079d6030ee4c1006094f44af1b9f090ac36"

RPROVIDES:${PN} += "python3-kiwi_crossprepare_plugin python3-kiwi_crossprepare_plugin(aarch-64) python3.10dist(kiwi-crossprepare-plugin) python3dist(kiwi-crossprepare-plugin)"
RDEPENDS:${PN} += "python(abi) python3-PyYAML python3-docopt python3-kiwi python3-setuptools qemu-linux-user"

inherit rpm

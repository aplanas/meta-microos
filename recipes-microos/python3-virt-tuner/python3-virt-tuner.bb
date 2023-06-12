SUMMARY = "Virtual Machine definition tuner"
DESCRIPTION = "Helps tuning the libvirt XML definition of a virtual machine for specific use cases."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python3-virt-tuner-0.0.3-2.6.noarch.rpm"
RPM_HASH = "67a0dc29d461e2c71eeb380a252ccbc6401d182bd625e13823468fa081288a78df915d0e6e7dda811cf3ad0cf15ead20b4cb601610ed74d25320e5641e25a995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virt-tuner \
python3.10dist(virt-tuner) \
python3dist(virt-tuner)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-libvirt-python \
update-alternatives"

inherit rpm

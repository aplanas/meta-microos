SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "ucode-amd-20230427-1.1.noarch.rpm"
RPM_HASH = "9499d8a9039a71ab570b376edaafb0f86ce673f340feb2db3eabedfd06d3e1e06ca17885502867fecf81d5a506ee9ebe0d12307d5e3566b24874c965b5428571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(amd-ucode/README) firmware(amd-ucode/microcode_amd.bin) firmware(amd-ucode/microcode_amd_fam15h.bin) firmware(amd-ucode/microcode_amd_fam16h.bin) firmware(amd-ucode/microcode_amd_fam17h.bin) firmware(amd-ucode/microcode_amd_fam19h.bin) ucode-amd"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch"

inherit rpm

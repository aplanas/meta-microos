SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "ucode-amd-20230517-1.1.noarch.rpm"
RPM_HASH = "a9ededcb2b6ec877e52e06d2256742dd2777ecad630bbfa1fc2e4a0a041175c68331b253d43ce17be5b696a54caa063c3e2e7bdd40ece0060f2a9a24c067d0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(amd-ucode/README) \
firmware(amd-ucode/microcode_amd.bin) \
firmware(amd-ucode/microcode_amd_fam15h.bin) \
firmware(amd-ucode/microcode_amd_fam16h.bin) \
firmware(amd-ucode/microcode_amd_fam17h.bin) \
firmware(amd-ucode/microcode_amd_fam19h.bin) \
ucode-amd"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch"

inherit rpm

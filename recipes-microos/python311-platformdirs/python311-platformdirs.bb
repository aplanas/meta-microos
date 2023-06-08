SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-platformdirs-3.2.0-2.1.noarch.rpm"
RPM_HASH = "a594d691265994d0ec6b8e556db9f00dbe60ac872d3d9773aae357f8ef0ab56467437d240a988b14a8ed8188d29d3f89a0c52042f29531b0a7b77aba1ede0b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(platformdirs) python311-platformdirs python3dist(platformdirs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

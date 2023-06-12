SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-neovim-0.4.3-1.12.noarch.rpm"
RPM_HASH = "d66730ead4bfa3b7a331d51a93905617c1ac1d43e79888a2d4810166b55541101816e56b5cc4a24b8d672d738bcc9c95abcf40c24064abe243c35ec806dc52d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pynvim) \
python311-neovim \
python311-nvim \
python3dist(pynvim)"
RDEPENDS:${PN} += "neovim \
python(abi) \
python311-greenlet \
python311-msgpack-python"

inherit rpm

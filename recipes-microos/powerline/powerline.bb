SUMMARY = "Status line and prompt utility"
DESCRIPTION = "Powerline is a status line plugin for vim, and provides status lines and prompts \
for several other applications, including zsh, bash, tmux, IPython, Awesome and \
Qtile."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "powerline-2.8.3-2.2.aarch64.rpm"
RPM_HASH = "1e29a50b681f57d1e72ef49cf530eea659f6c702af1ab315c5625e7436b2d727044b1fccb8f333cf71b52235b69eabb984d46626d5fe582c5fb251a78b7bc94c"

RPROVIDES:${PN} += "config(powerline) \
powerline \
powerline(aarch-64) \
python3-powerline-status \
python3.10dist(powerline-status) \
python3dist(powerline-status)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
libc.so.6(GLIBC_2.34)(64bit) \
powerline-fonts \
python(abi) \
python3 \
python3-psutil \
systemd"

inherit rpm

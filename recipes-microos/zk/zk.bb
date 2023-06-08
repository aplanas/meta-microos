SUMMARY = "Plain text note-taking assistant for markdown"
DESCRIPTION = "Zk is a plain text note-taking assistant for markdown. \
It is a command-line tool helping you to maintain a plain text Zettelkasten or personal wiki."
LICENSE = "BSD-2-Clause"

PV = "0.13.0"

RPM_NAME = "zk-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "f809d777a2d45997e20f28d32570a65d67f32c85b29cd7c8873691391d3edb1bc9430eeb9be7c7fd7617e7f61aa695c38ed864ff5ae37b61bd8683c84d4027be"

RPROVIDES:${PN} += "zk zk(aarch-64)"
RDEPENDS:${PN} += "fzf libc.so.6(GLIBC_2.34)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

SUMMARY = "Additional Unix Utilities"
DESCRIPTION = "This is a growing collection of the Unix tools that nobody thought to write long ago, when Unix was young. \
 \
So far, it includes the following utilities: \
 \
  - chronic: runs a command quietly unless it fails \
  - combine: combine the lines in two files using boolean operations \
  - errno: look up errno names and descriptions \
  - ifdata: get network interface info without parsing ifconfig output \
  - ifne: run a program if the standard input is not empty \
  - isutf8: check if a file or standard input is utf-8 \
  - lckdo: execute a program with a lock held \
  - mispipe: pipe two commands, returning the exit status of the first \
  - parallel: run multiple jobs at once \
  - pee: tee standard input to pipes \
  - sponge: soak up standard input and write to a file \
  - ts: timestamp standard input \
  - vidir: edit a directory in your text editor \
  - vipe: insert a text editor into a pipe \
  - zrun: automatically uncompress arguments to command \
 \
The `moreutils` package includes errno, ifdata, ifne, isutf8, lckdo, mispipe, pee and sponge. \
The remaining programs are included in the `moreutils-parallel`, `moreutils-perl`, `chronic` and `ts` packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & (GPL-2.0-or-later | MIT) & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.67"

RPM_NAME = "moreutils-0.67-2.2.aarch64.rpm"
RPM_HASH = "4184fd455e84c5ff6f8c26155ab170c23b0d0e7df979e8a741e5f020970c8fee4504305dc75414fefa4fdf60bd1033799790c9427da73d8645c0afd6d86a63ab"

RPROVIDES:${PN} += "moreutils moreutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

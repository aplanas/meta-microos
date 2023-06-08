SUMMARY = "Jack-Audio Connection Kit"
DESCRIPTION = "JACK is system for handling real-time, low latency audio \
(and MIDI). It runs on GNU/Linux, Solaris, FreeBSD, OS X and \
Windows (and can be ported to other POSIX-conformant \
platforms). It can connect a number of different \
applications to an audio device, as well as allowing them to \
share audio between themselves. Its clients can run in their \
own processes (ie. as normal applications), or can they can \
run within the JACK server (ie. as a 'plugin'). JACK also \
has support for distributing audio processing across a \
network, both fast & reliable LANs as well as slower, less \
reliable WANs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "jack-1.9.22-1.1.aarch64.rpm"
RPM_HASH = "45f489581d6a727d138b8ec10ad20f41282933a2a1122fbdb8599dacf7e93ca5cf52f333713eb8b0edb566f252fe3d96d4c850eee4918eaac874f0acfc6faa21"

RPROVIDES:${PN} += "jack jack(aarch-64) jack-audio-connection-kit jack2"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcelt0.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libexpat.so.1()(64bit) libffado.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libjackserver.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopus.so.0()(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm

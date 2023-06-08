SUMMARY = "GNU software radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "gnuradio-3.10.6.0-4.1.aarch64.rpm"
RPM_HASH = "a8b2d9ec86f344042bdf3097f307011cac02e5963520e4cf5e7ed803297c916ff7ee43da0f8cca35a15fc7ead190abbfc47df0946c8daa2095ffe56a1d5894b7"

RPROVIDES:${PN} += "application() application(gnuradio-grc.desktop) config(gnuradio) gnuradio gnuradio(aarch-64) metainfo() metainfo(org.gnuradio.grc.metainfo.xml) mimehandler(application/gnuradio-grc)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libSoapySDR.so.0.8()(64bit) libboost_program_options.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgmp.so.10()(64bit) libgnuradio-analog.so.3.10.6()(64bit) libgnuradio-audio.so.3.10.6()(64bit) libgnuradio-blocks.so.3.10.6()(64bit) libgnuradio-channels.so.3.10.6()(64bit) libgnuradio-digital.so.3.10.6()(64bit) libgnuradio-dtv.so.3.10.6()(64bit) libgnuradio-fec.so.3.10.6()(64bit) libgnuradio-fft.so.3.10.6()(64bit) libgnuradio-filter.so.3.10.6()(64bit) libgnuradio-iio.so.3.10.6()(64bit) libgnuradio-network.so.3.10.6()(64bit) libgnuradio-pdu.so.3.10.6()(64bit) libgnuradio-pmt.so.3.10.6()(64bit) libgnuradio-qtgui.so.3.10.6()(64bit) libgnuradio-runtime.so.3.10.6()(64bit) libgnuradio-soapy.so.3.10.6()(64bit) libgnuradio-trellis.so.3.10.6()(64bit) libgnuradio-uhd.so.3.10.6()(64bit) libgnuradio-video-sdl.so.3.10.6()(64bit) libgnuradio-vocoder.so.3.10.6()(64bit) libgnuradio-wavelet.so.3.10.6()(64bit) libgnuradio-zeromq.so.3.10.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libspdlog.so.1.11()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuhd.so.4.4.0()(64bit) libvolk.so.3.0()(64bit) python(abi) python3-SoapySDR python3-cairo python3-click python3-click-plugins python3-gobject-Gdk python3-jsonschema python3-mako python3-numpy python3-pyaml python3-pyqtgraph python3-pyzmq python3-qt5 python3-scipy typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(PangoCairo) typelib(cairo)"

inherit rpm

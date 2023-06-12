SUMMARY = "Stl-thumb is a fast lightweight thumbnail generator for STL files."
DESCRIPTION = "Stl-thumb is a fast lightweight thumbnail generator for STL files. \
It can show previews for STL files in your file manager on Linux and Windows. \
It is written in Rust and uses OpenGL."
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "stl-thumb-0.5.0~0-2.1.aarch64.rpm"
RPM_HASH = "5be7a2376cf0d0880367dabd391b14b698a30afe06c7fa7a143c63522ba5591a5d51f5b9afd751fb9a2cfcd583f0fe471d1759f88ab4c672609fb2dfd8997092"

RPROVIDES:${PN} += "bundled(rust-crate:addr2line) bundled(rust-crate:adler) bundled(rust-crate:adler32) bundled(rust-crate:approx) bundled(rust-crate:atty) bundled(rust-crate:autocfg) bundled(rust-crate:backtrace) bundled(rust-crate:bit_field) bundled(rust-crate:bitflags) bundled(rust-crate:bytemuck) bundled(rust-crate:byteorder) bundled(rust-crate:calloop) bundled(rust-crate:cbindgen) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:cgmath) bundled(rust-crate:chrono) bundled(rust-crate:clap) bundled(rust-crate:clap_lex) bundled(rust-crate:color_quant) bundled(rust-crate:crc32fast) bundled(rust-crate:crossbeam-channel) bundled(rust-crate:crossbeam-deque) bundled(rust-crate:crossbeam-epoch) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:cty) bundled(rust-crate:deflate) bundled(rust-crate:dlib) bundled(rust-crate:downcast-rs) bundled(rust-crate:either) bundled(rust-crate:exr) bundled(rust-crate:fastrand) bundled(rust-crate:flate2) bundled(rust-crate:float-cmp) bundled(rust-crate:flume) bundled(rust-crate:fnv) bundled(rust-crate:futures-core) bundled(rust-crate:futures-sink) bundled(rust-crate:getrandom) bundled(rust-crate:gif) bundled(rust-crate:gimli) bundled(rust-crate:gl_generator) bundled(rust-crate:glium) bundled(rust-crate:glutin) bundled(rust-crate:glutin_egl_sys) bundled(rust-crate:glutin_glx_sys) bundled(rust-crate:half) bundled(rust-crate:hashbrown) bundled(rust-crate:heck) bundled(rust-crate:image) bundled(rust-crate:indexmap) bundled(rust-crate:inflate) bundled(rust-crate:instant) bundled(rust-crate:itoa) bundled(rust-crate:jpeg-decoder) bundled(rust-crate:khronos_api) bundled(rust-crate:lazy_static) bundled(rust-crate:lebe) bundled(rust-crate:libc) bundled(rust-crate:libloading) bundled(rust-crate:lock_api) bundled(rust-crate:log) bundled(rust-crate:memchr) bundled(rust-crate:memmap2) bundled(rust-crate:memoffset) bundled(rust-crate:minimal-lexical) bundled(rust-crate:miniz_oxide) bundled(rust-crate:mint) bundled(rust-crate:mio) bundled(rust-crate:nanorand) bundled(rust-crate:nix) bundled(rust-crate:nom) bundled(rust-crate:num-integer) bundled(rust-crate:num-rational) bundled(rust-crate:num-traits) bundled(rust-crate:num_cpus) bundled(rust-crate:object) bundled(rust-crate:once_cell) bundled(rust-crate:os_str_bytes) bundled(rust-crate:osmesa-sys) bundled(rust-crate:parking_lot) bundled(rust-crate:parking_lot_core) bundled(rust-crate:percent-encoding) bundled(rust-crate:pin-project) bundled(rust-crate:pin-project-internal) bundled(rust-crate:pkg-config) bundled(rust-crate:png) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:raw-window-handle) bundled(rust-crate:rayon) bundled(rust-crate:rayon-core) bundled(rust-crate:remove_dir_all) bundled(rust-crate:rustc-demangle) bundled(rust-crate:ryu) bundled(rust-crate:scoped-tls) bundled(rust-crate:scoped_threadpool) bundled(rust-crate:scopeguard) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:shared_library) bundled(rust-crate:smallvec) bundled(rust-crate:smithay-client-toolkit) bundled(rust-crate:spin) bundled(rust-crate:stderrlog) bundled(rust-crate:stl-thumb) bundled(rust-crate:stl_io) bundled(rust-crate:strsim) bundled(rust-crate:syn) bundled(rust-crate:takeable-option) bundled(rust-crate:tempfile) bundled(rust-crate:termcolor) bundled(rust-crate:textwrap) bundled(rust-crate:thread_local) bundled(rust-crate:threadpool) bundled(rust-crate:tiff) bundled(rust-crate:time) bundled(rust-crate:toml) bundled(rust-crate:unicode-ident) bundled(rust-crate:wayland-client) bundled(rust-crate:wayland-commons) bundled(rust-crate:wayland-cursor) bundled(rust-crate:wayland-egl) bundled(rust-crate:wayland-protocols) bundled(rust-crate:wayland-scanner) bundled(rust-crate:wayland-sys) bundled(rust-crate:weezl) bundled(rust-crate:winit) bundled(rust-crate:x11-dl) bundled(rust-crate:xcursor) bundled(rust-crate:xml-rs) stl-thumb stl-thumb(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm

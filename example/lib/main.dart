import 'package:biodigital/biodigital_options.dart';
import 'package:biodigital/biodigital_view.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  void initState() {
    super.initState();
    _init();
  }

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: Scaffold());
  }

  _init() {
    BioDigitalOptions options = BioDigitalOptions(
      model: 'appendicitis',
    );
    BioDigitalView biodigital = BioDigitalView();
    biodigital.init(options);
  }
}

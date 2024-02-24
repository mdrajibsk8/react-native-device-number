# react-native-device-number

![npm](https://img.shields.io/npm/dt/react-native-device-number?style=flat-square) ![NPM](https://img.shields.io/npm/l/react-native-device-number?style=flat-square) ![npm](https://img.shields.io/npm/v/react-native-device-number?style=flat-square) ![npm collaborators](https://img.shields.io/npm/collaborators/react-native-device-number?style=flat-square)

`**This library only for Android**`


react-native-device-number is a helpful utility package for React Native developers, providing a seamless interface to retrieve the device's phone number within their applications. With this package, developers can easily access the device's phone number, facilitating personalized user experiences and enabling features such as phone number verification, contact synchronization, and more. react-native-device-number abstracts away the complexity of interacting with device-specific APIs, offering a simple and consistent method for fetching the phone number across different platforms. Whether you're building a communication app, authentication system, or simply need to identify users uniquely, this package simplifies the process, enhancing the development workflow and improving app functionality.


# Installation
#### NPM
```shell
npm install react-native-device-number --save
```

#### YARN
```shell
yarn add react-native-device-number
```
**If you are getting any error, while using this package in RN version below 0.66. Then try you use v1.0.5**

## Changelog

#### Added support for gradlew 7, Android 12 & RN - 0.68.2
#### Added support for latest android version 13+

## Supporting the project

Maintaining this project takes time. To help allocate time, you can Buy Me a Coffee :wink:

<a href="https://www.buymeacoffee.com/mdrajibsk8" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" width="200" height="50" ></a>

## Video Link

`Please Subscribe to my channel, so don't miss on my future video`

<a href="https://www.youtube.com/watch?v=qRPx_9wnZ3k&ab_channel=Developer%27sSin" target="_blank"><img src="https://github.com/mdrajibsk8/React-Native-Push-Notification-Firebase7/blob/master/de1c91788be0d791135736995109272a.png?raw=true" alt="View Video" width="100" height="100" ></a>

## Usage

```javascript
import DeviceNumber from 'react-native-device-number';

DeviceNumber.get().then((res) => {
  console.log(res);
});
```

## Demo

<img src="https://raw.githubusercontent.com/mdrajibsk8/react-native-device-number/master/img.png?raw=true" alt="Developers' Sin" width="250" height="450" >
